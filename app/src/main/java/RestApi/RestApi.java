package RestApi;

import java.util.List;

import Model.Resimler;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {


    @GET("/resimler.php")
    Call<List<Resimler>>getresimler();



}
