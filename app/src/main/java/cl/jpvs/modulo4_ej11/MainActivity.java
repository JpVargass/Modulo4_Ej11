package cl.jpvs.modulo4_ej11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cl.jpvs.modulo4_ej11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;   //paso1  el nombre depende del nombre de la clase
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());     // paso2 :

        setContentView(binding.getRoot());                              // paso3 ;
        binding.btnTurn.setOnClickListener(view -> Toast.makeText(this,"Botón <Turn off flight mode> selecionado", Toast.LENGTH_SHORT).show());
        binding.btnUpdating.setOnClickListener(view -> Toast.makeText(this,"Botón <Updating profile> selecionado", Toast.LENGTH_SHORT).show());
        binding.btnGallery.setOnClickListener(view -> Toast.makeText(this,"Botón <Picture saved to gallery>  selecionado", Toast.LENGTH_SHORT).show());
        binding.btnLock.setOnClickListener(view -> Toast.makeText(this,"Botón <Unlocked level 5>  selecionado", Toast.LENGTH_SHORT).show());
        binding.btnLevel.setOnClickListener(view -> Toast.makeText(this,"Botón <Level 4 completed>  selecionado", Toast.LENGTH_SHORT).show());
        binding.btnPause.setOnClickListener(view -> Toast.makeText(this,"Botón <Music paused>  selecionado", Toast.LENGTH_SHORT).show());

    }
}