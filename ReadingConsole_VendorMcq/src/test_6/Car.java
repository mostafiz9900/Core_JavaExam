/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_6;

/**
 *
 * @author Mostafizur
 */
 class Car extends Vehicle{
   String trans;
    
//   Car(String trans){
//    this.trans=trans;
//    }

   public  Car(String trans, String type, int maxSpeed) {
        super(type, maxSpeed);
        this.trans = trans;
    }
   

   
     public static void main(String[] args) {
         Car c1=new Car("4W", "Manual", 150);
     }
   
    
}
