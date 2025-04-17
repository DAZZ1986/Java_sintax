package main.Tasks600;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


public class Requests {

    public double getRequests() {
        String urlString = "https://currate.ru/api/?get=rates&pairs=USDRUB,EURRUB&key=8b8fdac67b06df54ed03037bc67e71e4"; // Замените на ваш URL
        try {
            // Создание URL
            URL url = new URL(urlString);
            // Открытие соединения
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            // Проверка кода ответа
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Чтение ответа
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Преобразование ответа в JSON
                String jsonResponse = response.toString();
                JSONObject jsonObject = new JSONObject(jsonResponse);   // Создание JSONObject из строки
                //System.out.println(jsonObject.toString(4)); // Вывод JSON, Форматированный вывод

                String eurRubValue = jsonObject.getJSONObject("data").getString("EURRUB");  // Извлечение значения EURRUB
                double euro = Double.parseDouble(eurRubValue);

                return euro;
            } else {
                System.out.println("GET request failed. Response Code: " + responseCode);
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }



}
