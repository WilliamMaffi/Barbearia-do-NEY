package controllers;

import models.Barbearia;
import play.data.Form;
import play.data.*;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class BarbeariaController extends Controller {

    public Result index(){
        return ok(index.render());
    }

    public Result barbearia(){
        return ok(marca_horario.render());
    }

    public Result marcarHorario(){
        return TODO;
    }

    public Result agendamento(){
        return ok(agendamento.render());
    }
}