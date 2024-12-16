/*
 * clase Users
 * Desarrollado por el subgrupo B
 * author: Carlos Calafat <> Copyright (C) BY-NC
 * author: Fco. Javier Franco <> Copyright (C) BY-NC
 *
 * Administracion de las playlist de canciones dentro de la base de datos. 
 * */

package musicapp;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Clase inmutable
 *
 * Usar como recurso, no modificar
 */
class User extends HashMap<String, String> {
  public User(String nick, String name, String email, String password){
    this.put("nick", nick);
    this.put("name", name);
    this.put("email", email);
    this.put("password", password);
  }

  public String getParameter(String key){
    return this.get(key);
  }

  public Boolean setParameter(String key,String value){
    return this.put(key, value) == value;
  }
}

public class Users {
  /* Obtiene todos los usuarios que tienen el email que se pasa
   * como parametro
   */
  public static ArrayList<User> getUserByMail(String email){
    return new ArrayList<>(); // TODO
  }

  /* Obtiene las canciones favoritas de un usuario
   */
  public static ArrayList<Song> getUserFavorites(User user){
    return new ArrayList<>(); // TODO
  }

  /* Anade una cancion favorita a un usuario.
   * Insertar en la tabla de canciones favoritas atribuyendose al
   * usuario user.
   */
  public static Boolean addFavoriteSongToUser(User user, Song song){
    return true; // TODO
  }

  /* Obtener los usuarios que tienen el mismo
   * nombre.
   */
  public static ArrayList<User> getUsersWithName(String name){
    return new ArrayList<>(); // TODO 
  }
}

