/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.Date;
import misc.DataBaseHandler;

/**
 *
 * @author Theoretics
 */
public class VIPchecker {
    DataBaseHandler dbh = new DataBaseHandler();
    public String vipName = "";
    public String vipNumber = "";
    public Date expDate = null;
    
    public boolean isVIP(String cardCode) {
        if (dbh.getVIPlist(cardCode)) {
            vipName = dbh.getVIPname();
            vipNumber = dbh.getVIPnumber();
            expDate = dbh.getVIPexpDate();
            return true;
        }
        return false;
    }
    
}
