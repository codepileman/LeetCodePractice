package SimplifyPath;

import com.sun.corba.se.spi.orbutil.fsm.FSMImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }
    public static String simplifyPath(String path) {

        if(path.length() == 0 || path == null){
            return "";
        }

        List<String> res = new ArrayList<>();

        for (int i = 1; i < path.length(); i++) {
            String temp = "";
            while(i < path.length() && path.charAt(i) != '/' ){
                temp += path.charAt(i);
                i++;
            }

            if(temp.equals(".") || temp.equals("") || (temp.equals("..") && res.size() == 0)){
                continue;
            }else if(temp.equals("..") && res.size() > 0){
                res.remove(res.size()-1);
            }else {
                res.add(temp);
            }

        }


        if(res.size() == 0){
            return "/";
        }
        String finalStr = "";
        for(int i = 0; i < res.size(); i++){
            finalStr += "/" + res.get(i);
        }

        return finalStr;

    }
}
