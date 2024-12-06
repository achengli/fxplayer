/*
 * clase Comments
 * Desarrollado por el subgrupo C
 * author: Jorge Ristori <> Copyright (C) BY-NC
 * author: Victor <> Copyright (C) BY-NC
 *
 * Gestion de los comentarios en la base de datos y proporcionarlos a la interfaz.
 * */
package musicapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

/*
 * INMUTABLE
 * Esta clase se debe usar sin ser modificada, es una clase estructura para ser usada
 * como contenedor de los datos de cada cancion.
 * 
 * Atributos de la estructura de datos:
 * - comment_id: ID
 * - comment: Contenido del comentario
 * - date: Fecha de publicacion del comentario
 * - response: 
  * */

class Comment {
  public Integer comment_id;
  public String comment;
  public Date date = new Date();
  public Integer response = -1;

  public Comment(Integer comment_id, String comment, Date date, Integer response){
    this.comment_id = comment_id;
    this.comment = comment;
    this.date = date;
    this.response = response;
  }

  public Comment(Integer comment_id, String comment, Date date){
    this.comment_id = comment_id;
    this.comment = comment;
    this.date = date;
  }

  public Comment(Integer comment_id, String comment){
    this.comment_id = comment_id;
    this.comment = comment;
  }
}

/* INMUTABLE
 * Esta clase es un contenedor de un valor que puede ser un string o un entero.
 * No modificar la clase, solo usarla si es necesario.
 */
class StringOrInteger {
  public String str_val = null;
  public Integer int_val = null;

  public StringOrInteger(String val){
    this.str_val = val;
  }

  public StringOrInteger(Integer val){
    this.int_val = val;
  }

  public Integer Int(){
    if (str_val != null) {
      try {
        return Integer.parseInt(str_val);
      } catch (NumberFormatException number_format_exception){
        return null;
      }
    } else {
      return int_val;
    }
    return null;
  }

  public String Str(){
    if (int_val != null)
      return int_val.toString();
    return str_val;
  }

  public Boolean isInteger(){
    return this.str_val == null;
  }

  public Boolean isString(){
    return this.int_val == null;
  }
}


public class Comments {
  
  private ArrayList<Comment> searchAllComments(String song_name){
    return searchAllComments(new StringOrInteger(song_name));
  }

  private ArrayList<Comment> searchAllComments(Integer song_id){
    return searchAllComments(new StringOrInteger(song_id));
  }

  /*
   * Devuelve todos los comentarios asociados a una cancion
   */
  public static ArrayList<Comment> searchAllComments(StringOrInteger song){
    return new ArrayList<Comment>();
  }
}
