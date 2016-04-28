package mx.uatx.sipeeec.dao;

import mx.uatx.sipeeec.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}