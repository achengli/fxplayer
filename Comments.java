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
 */
class Comment extends HashMap<String, Object> {
  public Comment(Integer comment_id, String comment, Date date, Integer response){
    super.put("comment_id", comment_id);
    super.put("comment", comment);
    super.put("date", date);
    super.put("response", response >= 0 ? response : -1);
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
    return new ArrayList<Comment>(); // TODO
  }

  /*
   * Devuelve las respuestas asociadas a un comentario concreto
   */
  public static ArrayList<Comment> searchResponses(Integer comment_id){
    return new ArrayList<Comment>(); // TODO
  }

  /*
   * Anade un comentario a una cancion (usando el id de la cancion)
   */
  public static Boolean postComment(Integer song_id, Comment comment){
    return true; // TODO
  }

  /*
   * Anade una respuesta a un comentario (usando el id del comentario)
   */
  public static Boolean postResponse(Integer comment_id, Comment response){
    return true; // TODO
  }
}
