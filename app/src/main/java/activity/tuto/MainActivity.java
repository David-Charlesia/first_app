package activity.tuto;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText(R.string.app_name);
        setContentView(text);
        TextView text2=new TextView(this);
        text2.setText(R.string.pays);
        setContentView(text2);
    }
}
