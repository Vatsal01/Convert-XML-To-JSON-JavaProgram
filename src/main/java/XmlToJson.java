import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class XmlToJson {

    static String str ="", ident="" ;

    public static void main(String[] args) throws JSONException ,IOException
    {
        String inputXML = "Lab01.xml" ;

        BufferedReader br = new BufferedReader( new FileReader(inputXML)) ;
           while(( ident= br.readLine()) != null)

    {
        str+=ident ;
    }

        JSONObject data = XML.toJSONObject(str);
        System.out.println(data);

        FileWriter file = new FileWriter("convertedJSON2.json") ;
        file.write(data.toString());
        file.flush();
    }

}
