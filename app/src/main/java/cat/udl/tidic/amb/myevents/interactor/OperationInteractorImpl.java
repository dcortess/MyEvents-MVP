package cat.udl.tidic.amb.myevents.interactor;

import cat.udl.tidic.amb.myevents.interfaces.OperationPresenter;

public class OperationInteractorImpl {

    private String result;
    private OperationPresenter presenter;

    public OperationInteractorImpl(OperationPresenter operationPresenter) {
        this.presenter = operationPresenter;
    }


    public void onClick(String fullname, String description){

        String bio = "Hola " + fullname + "! Em complau convidar-te a " + description;
        presenter.showResult(bio);

    }

}
