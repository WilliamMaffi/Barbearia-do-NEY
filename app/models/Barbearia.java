package models;

import java.util.HashSet;

import play.data.*;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Barbearia extends Model {
    @Id
    public Long id;
    public String nome, telefone;

    public static Finder<Long, Barbearia> find = new Finder<>(Barbearia.class);

}
