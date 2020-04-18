package donguyennhathan.com.hoccontextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import donguyennhathan.com.hoccontextmenu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        addContextMenu();
    }

    private void addContextMenu() {
        registerForContextMenu(binding.btn1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.main_context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.mnMauDo:
                binding.txtName.setTextColor(Color.RED);
                break;
            case R.id.mnMauXanh:
                binding.txtName.setTextColor(Color.BLUE);
                break;
            case R.id.mnMauVang:
                binding.txtName.setTextColor(Color.YELLOW);
                break;
        }
        return super.onContextItemSelected(item);
    }
}
