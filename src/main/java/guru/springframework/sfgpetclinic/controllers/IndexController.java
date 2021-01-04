package guru.springframework.sfgpetclinic.controllers;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler(){
//        throw new RuntimeException("oups Handler exception");
        return "notimplemented";
    }
}
