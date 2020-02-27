package cat.udl.tidic.amb.myevents.presentador;

import java.text.CollationElementIterator;

import cat.udl.tidic.amb.myevents.interactor.OperationInteractorImpl;
import cat.udl.tidic.amb.myevents.interfaces.OperationInteractor;
import cat.udl.tidic.amb.myevents.interfaces.OperationPresenter;
import cat.udl.tidic.amb.myevents.interfaces.OperationView;

public class OperationPresenterImpl {

    private CollationElementIterator editText_bio;
    private OperationView view;
    private OperationInteractor interactor;

    public OperationPresenterImpl(OperationView view) {
        this.view = view;
        this.interactor = new OperationInteractorImpl(this);
    }

    @Override
    public void showResult(String bio) {
        if (view != null) {
            view.showResult(bio);
        }
    }
    public void onClick(String fullname, String description) {
        if (interactor != null) {
            interactor.onClick(fullname, description);
        }
    }
}
