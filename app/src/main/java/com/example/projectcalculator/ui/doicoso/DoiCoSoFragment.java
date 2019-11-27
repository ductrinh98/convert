package com.example.projectcalculator.ui.doicoso;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.projectcalculator.R;

import java.security.Key;

public class DoiCoSoFragment extends Fragment {
    EditText edtBinary,edtOctal,edtDecimal,edtHex;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doicoso,container,false);
        edtBinary = view.findViewById(R.id.edt_binary);
        edtDecimal = view.findViewById(R.id.edt_decimal);
        edtOctal = view.findViewById(R.id.edt_octal);
        edtHex = view.findViewById(R.id.edt_hex);
        edtBinary.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(keyEvent.getAction()== KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtBinary.append("0");
                        String binary = edtBinary.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=binary.length()-1;j>=0;j--)
                        {
                            decimal += (int)(binary.charAt(j)-48)*p;
                            p*=2;
                        }
                        edtDecimal.setText(decimal+"");
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {

                        edtBinary.append("1");
                        String binary = edtBinary.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=binary.length()-1;j>=0;j--)
                        {
                            decimal += (int)(binary.charAt(j)-48)*p;
                            p*=2;
                        }
                        edtDecimal.setText(decimal+"");
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    return true;
                }
                return false;
            }
        });
        edtOctal.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if (i == KeyEvent.KEYCODE_0) {
                        edtOctal.append("0");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_1) {
                        edtOctal.append("1");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_2) {
                        edtOctal.append("2");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_3) {
                        edtOctal.append("3");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_4) {
                        edtOctal.append("4");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_5) {
                        edtOctal.append("5");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_6) {
                        edtOctal.append("6");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_7) {
                        edtOctal.append("7");
                        String octal = edtOctal.getText().toString();
                        int decimal = 0 ,p=1;
                        for(int j=octal.length()-1;j>=0;j--)
                        {
                            decimal += (int)(octal.charAt(j)-48)*p;
                            p*=8;
                        }
                        edtDecimal.setText(decimal+"");
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    return true;
                }
                return false;
            }
        });

        edtDecimal.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                int decimal;
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {

                    if (i == KeyEvent.KEYCODE_0) {
                        edtDecimal.append("0");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_1) {
                        edtDecimal.append("1");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }

                    if (i == KeyEvent.KEYCODE_2) {
                        edtDecimal.append("2");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_3) {
                        edtDecimal.append("3");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_4) {
                        edtDecimal.append("4");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_5) {
                        edtDecimal.append("5");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_6) {
                        edtDecimal.append("6");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_7) {
                        edtDecimal.append("7");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_8) {
                        edtDecimal.append("8");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    if (i == KeyEvent.KEYCODE_9) {
                        edtDecimal.append("9");
                        decimal = Integer.parseInt(edtDecimal.getText().toString());
                        edtBinary.setText(Integer.toBinaryString(decimal));
                        edtOctal.setText(Integer.toOctalString(decimal));
                        edtHex.setText(Integer.toHexString(decimal));
                    }
                    return true;
                }
                return false;
            }
        });
        edtHex.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN)
                {
                    if(i == KeyEvent.KEYCODE_0)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_1)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_2)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_3)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_4)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_5)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_6)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_7)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_8)
                    {
                        edtHex.append("");
                    }
                    if(i == KeyEvent.KEYCODE_9)
                    {
                        edtHex.append("");
                    }
                    if (i == KeyEvent.KEYCODE_A)
                    {
                        edtHex.append("");
                    }
                    if (i == KeyEvent.KEYCODE_B) {
                        edtHex.append("");
                    }
                    if (i == KeyEvent.KEYCODE_C){
                        edtHex.append("");
                    }
                    if (i == KeyEvent.KEYCODE_D) {
                        edtHex.append("");
                    }
                    if (i == KeyEvent.KEYCODE_E) {
                        edtHex.append("");
                    }
                    if (i == KeyEvent.KEYCODE_F) {
                        edtHex.append("");
                    }
                    return true;
                }
                return false;
            }
        });
        return view;
    }
}