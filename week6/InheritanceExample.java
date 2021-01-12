package week6;
public class InheritanceExample{
    public static void main(String[]agrs){
        //Krit Tipnuan 632115002
        Artist art = new Artist("Ball", 20,"Male");
        art.genre="hip hop";
        art.introduce();
        art.playMusic();
        System.out.println("-------------------------------------------------------------------------");

        CEO per1 = new CEO("HIN", 19,"Male");
        per1.company="Frit";
        per1.introduce();
        per1.whatCom();
        System.out.println("-------------------------------------------------------------------------");

        Chef per2 = new Chef("JoJo", 19,"Male");
        per2.kindOfChef="local";
        per2.introduce();
        per2.WhatChef();
        System.out.println("-------------------------------------------------------------------------");

        Engineer per3 = new Engineer("Poom", 19,"Male");
        per3.thisEngineer="Mechanical";
        per3.introduce();
        per3.WhatEngineer();
        System.out.println("-------------------------------------------------------------------------");

        Doctor per4 = new Doctor("Lit", 19,"Female");
        per4.whereDoWork="Serirah hospital";
        per4.introduce();
        per4.Where();
        System.out.println("-------------------------------------------------------------------------");
        
        DrugDealer per5 = new DrugDealer("Mark", 19,"Male");
        per5.drug="Para";
        per5.bath=40;
        per5.introduce();
        per5.SellAndCost();
        System.out.println("-------------------------------------------------------------------------");
    }
}