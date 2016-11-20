package example.com.hellodatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Model extends BaseObservable{

    private String title;

    public Model(String title)
    {
        this.title=title;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(example.com.hellodatabinding.BR.title);
    }
}
