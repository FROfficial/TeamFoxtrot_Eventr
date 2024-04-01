/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventr;

/**
 *
 * @author nick
 */
public class Events {
    
    private String where;
    private String when;
    private String aboutUs;
    private String backgroundImage;
    private String title;
    
    private boolean Liked;
    
  
    
    
    
   
    Events(){};
     
    Events(String titleEvent){title = titleEvent;}
   
     
    
    Events(String whereItIs, String whenItIs, String aboutTheEvent, String image)
    {
        where = whereItIs;
        when = whenItIs;
        aboutUs = aboutTheEvent;
        backgroundImage = image;
    }
    
    
    public boolean getLiked()
    {
        return Liked;
    }
    public void setLiked(boolean setlike)
    {
        Liked = setlike;
    }
    
   
    public String getImage()
    {
        return backgroundImage;
    }
    public String getAbout()
    {
        return aboutUs;
    }
    
    public String getWhen()
    {
        return when;
    }
    public String getWhere()
    {
        return where;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    
    public void setWhere(String input)
    {
        where = input;
    }
        public void setImage(String input)
    {
        backgroundImage = input;
    }
    public void setWhen(String input)
    {
        when = input;
    }
    public void setAbout(String input)
    {
        aboutUs = input;
    }
    public void setbackgroundImage(String input)
    {
        backgroundImage = input;
    }
    public void setTitle(String input)
    {
        title = input;
    }
    


    
    
   
}
