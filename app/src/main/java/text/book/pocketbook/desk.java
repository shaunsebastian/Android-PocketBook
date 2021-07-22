package text.book.pocketbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class desk extends AppCompatActivity {
 Button pro,qr,lib;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desk);
        pro= (Button)findViewById(R.id.profile);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),profile.class);
                startActivity(intent);
            }
        });
        qr= (Button)findViewById(R.id.qrcode);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),qrscanner.class);
                startActivity(intent);
            }
        });
        lib= (Button)findViewById(R.id.libn);
        lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),library.class);
                startActivity(intent);
            }
        });

    }
}
