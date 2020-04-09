package cat.udl.tidic.amb.myevents.Presenter;

import cat.udl.tidic.amb.myevents.Model.Persona;
import cat.udl.tidic.amb.myevents.UserViewActions;

public class User_Presenter {

    private Persona persona = new Persona();
    private UserViewActions view;


    public User_Presenter(UserViewActions view) {
         this.view = view;
    }

    public void setUserFullName(String name){
        this.persona.setNombre(name);
    }

    public void setUserDescription(String description)
    {
        this.persona.setEvento(description);
    }

    public void setEventDate(String date){
        this.persona.setFecha(date);
    }

    public void showBio(){
        view.updateUI(this.persona.toString());
    }


}
