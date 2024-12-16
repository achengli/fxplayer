/*
 * clase People
 * Desarrollado por el subgrupo A
 * author: Hugo Nieto <> Copyright (C) BY-NC
 * author: Yassin Achengli <yassinachengli@hotmail.com> Copyright (C) BY-NC
 *
 * Administracion de las playlist de canciones dentro de la base de datos. 
 * */

package musicapp;

import java.util.ArrayList;
import java.util.HashMap;

class Group extends HashMap<String, Object>{
  public Group(Integer id){
    this.put("id", id);
  }

  public Group(Integer id, String name){
    this.put("id", id);
    this.put("name", name);
  }

  public Group(Integer id, String name, String author){
    this.put("id", id);
    this.put("name", name);
    this.put("author", author);
  }

  public Object getGroupParameter(String param){
    return this.get(param);
  }
}

public class People {
  private String nick = "";
  private String name = "";
  private Integer id;

  public People(Integer id){
    this.id = id;
  }

  public People(Integer id, String nick){
    this.id = id;
    this.nick = nick;
  }

  public People(Integer id, String nick, String name){
    this.id = id;
    this.nick = nick;
    this.name = name;
  }

  public String getAuthorName(){
    return nick;
  }

  public String getName(){
    return name;
  }

  public Boolean addPeople(People p){
    return true; // TODO
  }

  public static ArrayList<Group> searchGroups(People p){
    return new ArrayList<>(); // TODO
  }

  public static ArrayList<People> getGroupMembers(Group g){
    return new ArrayList<>();
  }
}
