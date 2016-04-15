package drpcClient;

import java.util.Map; 
import backtype.storm.utils.Utils;
import backtype.storm.utils.DRPCClient;

public class DrpcClient 
{
    public static void main( String[] args )
    {
        System.out.println( "simple drpc client!" );

                try {
                        Map conf = Utils.readStormConfig();
                        DRPCClient client = new DRPCClient(conf, "10.121.106.198", 3772);
                        String[] strs = new String[]{"http://twitter.com","hello", "world"};
                        for(String s: strs) {
                                String result = client.execute("exclamation", s);
                                System.out.println(result);
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }
    }
}
