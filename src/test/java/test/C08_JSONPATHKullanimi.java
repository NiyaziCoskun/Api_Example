package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C08_JSONPATHKullanimi {

    @Test
    public void jsonPath01(){

        JSONObject kisiBilgisi = new JSONObject();
        JSONObject adresBilgisi = new JSONObject();
        JSONObject cepTelBilgisi = new JSONObject();
        JSONObject evTelBilgisi = new JSONObject();
        JSONArray telBilgileri = new JSONArray();

        cepTelBilgisi.put("type" , "home");
        cepTelBilgisi.put("number", "0123-4567-8888");

        evTelBilgisi.put("type" , "home");
        evTelBilgisi.put("number", "0123-4567-8910");

        telBilgileri.put(cepTelBilgisi);
        telBilgileri.put(evTelBilgisi);

        adresBilgisi.put("streetAdress", "naist street");
        adresBilgisi.put("city", "Nara");
        adresBilgisi.put("postalCode", "630-0195");

        kisiBilgisi.put("firstName", "Can");
        kisiBilgisi.put("lastName", "Doe");
        kisiBilgisi.put("age", 26);
        kisiBilgisi.put("address", adresBilgisi);
        kisiBilgisi.put("phoneNumbers", telBilgileri);



    }
}
