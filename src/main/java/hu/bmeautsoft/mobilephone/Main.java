package hu.bmeautsoft.mobilephone;

import hu.bmeautsoft.mobilephone.business.Business;

public class Main {

    public static void main(String args[]){
        Business business = new Business();
        business.initializeTodoList();
        business.showTodoList();
    }
}
