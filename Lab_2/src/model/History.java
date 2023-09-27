/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kaush
 */
public class History {
    
    private ArrayList<VitalSigns>vitalh;
    
    public History(){
        
        this.vitalh = new ArrayList<VitalSigns>();
        
        
    }

    public ArrayList<VitalSigns> getVitalh() {
        return vitalh;
    }

    public void setVitalh(ArrayList<VitalSigns> vitalh) {
        this.vitalh = vitalh;
    }
    
    public VitalSigns addNewVitals()
    {
    
        VitalSigns newVitals = new VitalSigns();
        vitalh.add(newVitals);
        return newVitals;
        
}
    public void deleteVitals(VitalSigns vs)
    {
        vitalh.remove(vs);
        
    }
}
