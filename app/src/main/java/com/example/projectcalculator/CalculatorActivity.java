package com.example.projectcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private String history;

    private EditText editNumber;
    private TextView tvResult;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;

    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;

    private Button btnPoint;
    private Button btnResult;
    private Button btnClear;
    private Button btnClearAll;
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        initWidget();
        setEventClickViews();
    }

    public void initWidget() {

        editNumber = (EditText) findViewById(R.id.edit_input);
        tvResult = (TextView) findViewById(R.id.tv_result);

        btnNumber1 = (Button) findViewById(R.id.btnNumber1);
        btnNumber2 = (Button) findViewById(R.id.btnNumber2);
        btnNumber3 = (Button) findViewById(R.id.btnNumber3);
        btnNumber4 = (Button) findViewById(R.id.btnNumber4);
        btnNumber5 = (Button) findViewById(R.id.btnNumber5);
        btnNumber6 = (Button) findViewById(R.id.btnNumber6);
        btnNumber7 = (Button) findViewById(R.id.btnNumber7);
        btnNumber8 = (Button) findViewById(R.id.btnNumber8);
        btnNumber9 = (Button) findViewById(R.id.btnNumber9);
        btnNumber0 = (Button) findViewById(R.id.btnNumber0);

        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);

        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClearAll = (Button) findViewById(R.id.btnClearAll);
        btnResult = (Button) findViewById(R.id.btnResult);
    }

    public void setEventClickViews() {
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClearAll.setOnClickListener(this);
        btnResult.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNumber0:
                //TO DO
                editNumber.append("0");
                break;
            case R.id.btnNumber1:
                //TO DO
                editNumber.append("1");
                break;
            case R.id.btnNumber2:
                //TO DO
                editNumber.append("2");
                break;
            case R.id.btnNumber3:
                editNumber.append("3");
                //TO DO
                break;
            case R.id.btnNumber4:
                //TO DO
                editNumber.append("4");
                break;
            case R.id.btnNumber5:
                //TO DO
                editNumber.append("5");
                break;
            case R.id.btnNumber6:
                //TO DO
                editNumber.append("6");
                break;
            case R.id.btnNumber7:
                //TO DO
                editNumber.append("7");
                break;
            case R.id.btnNumber8:
                //TO DO
                editNumber.append("8");
                break;
            case R.id.btnNumber9:
                //TO DO
                editNumber.append("9");
                break;
            case R.id.btnCong:
                //TO DO
                editNumber.append("+");
                break;
            case R.id.btnTru:
                //TO DO
                editNumber.append("-");
                break;
            case R.id.btnNhan:
                //TO DO
                editNumber.append("*");
                break;
            case R.id.btnChia:
                //TO DO
                editNumber.append("/");
                break;

            case R.id.btnPoint:
                //TO DO
                editNumber.append(".");
                break;
            case R.id.btnClear:
                //TO DO
                history = history + "\n----------------------------------------\n";
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(editNumber, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
            case R.id.btnClearAll:
                //TO DO
                history = history + "\n----------------------------------------\n";
                editNumber.setText("");
                tvResult.setText("");

                break;
            case R.id.btnResult:
                //To do
                DecimalFormat df = new DecimalFormat("###.#######");
                double result = 0;
                addOperation(editNumber.getText().toString());
                addNumber(editNumber.getText().toString());
                // Thuật toán tính toán biểu thức
                if (arrOperation.size() >= arrNumber.size() || arrOperation.size() < 1) {
                    tvResult.setText("Lỗi định dạng");
                } else {
                    history = "";

                    for (int i = 0; i < (arrNumber.size() - 1); i++) {
                        switch (arrOperation.get(i)) {
                            case "+":
                                if (i == 0) {
                                    result = arrNumber.get(i) + arrNumber.get(i + 1);
                                    history = history + Double.toString(arrNumber.get(i)) +"\n+\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                } else {
                                    result = result + arrNumber.get(i + 1);
                                    history = history + "\n+\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                }
                                break;
                            case "-":
                                if (i == 0) {
                                    result = arrNumber.get(i) - arrNumber.get(i + 1);
                                    history = history + Double.toString(arrNumber.get(i)) +"\n-\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                } else {
                                    result = result - arrNumber.get(i + 1);
                                    history = history + "\n-\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                }
                                break;
                            case "*":
                                if (i == 0) {
                                    result = arrNumber.get(i) * arrNumber.get(i + 1);
                                    history = history + Double.toString(arrNumber.get(i)) +"\n*\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                } else {
                                    result = result * arrNumber.get(i + 1);
                                    history = history + "\n*\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                }
                                break;
                            case "/":
                                if (i == 0) {
                                    result = arrNumber.get(i) / arrNumber.get(i + 1);
                                    history = history + Double.toString(arrNumber.get(i)) +"\n/\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                } else {
                                    result = result / arrNumber.get(i + 1);
                                    history = history + "\n/\n"
                                            + Double.toString(arrNumber.get(i+1)) +"\n-----------\n"
                                            + Double.toString(result);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    tvResult.setText(df.format(result) + "");
                }
                history = history + "\n----------------------------------------\n";

                // tvResult.setText(df.format(result) + "");
                //  editNumber.setText("");
                //  result = 0;
//        }
        }

    }

    //Mảng chứa các phép tính +, - , x, /
    public ArrayList<String> arrOperation;
    //Mảng chứa các số
    public ArrayList<Double> arrNumber;

    //Lấy tất cả các phép tính lưu vào mảng arrOperation
    public int addOperation(String input) {
        arrOperation = new ArrayList<>();

        char[] cArray = input.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            switch (cArray[i]) {
                case '+':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '-':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '*':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '/':
                    arrOperation.add(cArray[i] + "");
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    //Lấy tất cả các số lưu vào mảng arrNumber
    public void addNumber(String stringInput) {
        arrNumber = new ArrayList<>();
        Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = regex.matcher(stringInput);
        while (matcher.find()) {
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }
    }

    public void backClicked(View v)
    {
        this.onBackPressed();
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("feedback",history);
        this.setResult(Activity.RESULT_OK,intent);
        super.finish();
    }
}
