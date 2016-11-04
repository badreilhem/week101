public class JsonEncoderImpl implements api.week1.JsonEncoder {
  
  public String toJson( String str ) {
    if(str.contains("\"")){
      return str.subString()+""+str.subString()
    }else if(str.contains("\\")){
      return 
    }else{
      return "\""+str+"\"";
    }
  }
  
  public String toJson( Number n ) {
    Double tmp = new Double(n.doubleValue());
    return tmp.toString();
  }
  
  public String toJson( java.util.Map map ) {
    String ret = "{";
    boolean first = true;
    for( Object key : map.keySet() ) {
      if ( !first ) ret += ",";
      else first = false;
      Object value = map.get(key);
      
      // TODO: change this implementation.
      ret += "\"key\": \"value\"";
    }
    return ret + "}";
  }
  
  public static void main(String args[]) {
    JsonEncoderImpl enc = new JsonEncoderImpl();
    System.out.println( enc.toJson(12d) );
  }
}
