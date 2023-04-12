package com.driver;

public class Pizza {

    private int price;
    private boolean addtakeaway=false;
    private int billcount;
    private Boolean isVeg;
    private String bill;
    private int chese=0;
    private int toppings=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true) price=300;
        else price =400;
        billcount+=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(chese!=1){
        chese=1;
        billcount+=80;}

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true && toppings!=1){
            toppings=1;
            billcount+=70;
        }
        else if(isVeg!=true && toppings!=1){
            toppings=1;
            billcount+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addtakeaway==false){
            billcount+=20;
            addtakeaway=true;
        }

    }

    public String getBill(){
        // your code goes here
        StringBuilder str= new StringBuilder();
        str.append("Base Price Of The Pizza: ");
        str.append(price+"\n");
        if(chese==1){
        str.append("Extra Cheese Added: ");
        str.append(80+"\n");}
        if(toppings==1){
        str.append("Extra Toppings Added: ");
        if(isVeg==false)str.append(120+"\n");
        else str.append(70+"\n");
        }
        if(addtakeaway==true){
        str.append("Paperbag Added: ");
        str.append(20+"\n");}
        str.append("Total Price: "+billcount+"\n");
        bill=str.toString();
        return this.bill;
    }
}
