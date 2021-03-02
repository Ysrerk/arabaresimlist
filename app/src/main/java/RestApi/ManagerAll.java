package RestApi;

import java.util.List;

import Model.Resimler;
import retrofit2.Call;

public class ManagerAll extends BaseManager {
    public Call<List<Resimler>> alresimler(){

        Call<List<Resimler>>resim=getrestapi().getresimler();
        return resim;
    }
}
