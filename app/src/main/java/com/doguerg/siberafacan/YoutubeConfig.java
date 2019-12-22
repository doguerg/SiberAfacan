package com.doguerg.siberafacan;

public class YoutubeConfig {
   public YoutubeConfig()
   {

   }
    // Developers Google aracılığıyla bağlanılan youtube api'den alınan key yazılır
    private static final String API_KEY = " "; //boşluğa api key'i yaz. Boşsa normal çalışır.
    // bu metod çağırıldığında api key dönecek 
    static String getApiKey() {
        return API_KEY;
    }
}
