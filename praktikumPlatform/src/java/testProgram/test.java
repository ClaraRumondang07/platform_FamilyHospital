/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testProgram;

import com.google.gson.Gson;
import helper.PasienHelper;
import java.util.List;
import pojos.Pasien;

/**
 *
 * @author basisa16
 */
public class test {

    public static void main(String[] args) {
        PasienHelper test = new PasienHelper();
        List<Pasien> list = test.getAllPasien();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
