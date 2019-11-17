package oop;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Date;

class Abc
{
    String name;
    Date d ;


}




public class CustomSerializerTest {

    public static void main(String[] args) {

        Abc abc = new Abc();
        abc.name = "Naam hai tera tera ";
        abc.d = new Date();

        Gson gson = new Gson();

        System.out.println(gson.toJson(abc).toString());


        GsonBuilder gb = new GsonBuilder();
        JsonSerializer<Abc> serializer = new JsonSerializer<Abc>() {
            @Override
            public JsonElement serialize(Abc abc, Type type, JsonSerializationContext jsonSerializationContext) {
                JsonObject jsonMerchant = new JsonObject();

                jsonMerchant.addProperty("Id", abc.name+"YEH ADDED HAI CUSTOM M ");

                return jsonMerchant;
            }
        } ;

        gb.registerTypeAdapter(Abc.class,serializer);

        Gson customGson = gb.create();
        String customJSON = customGson.toJson(abc);

        System.out.println(customJSON);
    }
}
