package com.mesconverter.Fragments;

import android.app.Fragment;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mesconverter.R;
import com.mesconverter.UnitDBHelper;


public class Tempreture extends Fragment {

    TextView to_view;
    TextView from_view;
    ImageView icon;

    EditText to_edit;
    EditText from_edit;

    UnitDBHelper unitDBHelper;
    Double value = null, multiplier = null;

    Button convert;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.main_fragment, container, false);
        Spinner from_spinner = v.findViewById(R.id.from_spinner);
        final Spinner to_spinner = v.findViewById(R.id.to_spinner);

        to_view = v.findViewById(R.id.to_view);
        from_view = v.findViewById(R.id.from_view);

        to_edit = v.findViewById(R.id.to_edit);
        from_edit = v.findViewById(R.id.from_edit);

        icon = v.findViewById(R.id.icon);

        icon.setImageDrawable(getResources().getDrawable(R.mipmap.ic_temperature));

        ArrayAdapter<CharSequence> from_adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.temperature, android.R.layout.simple_spinner_item);
        from_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from_spinner.setAdapter(from_adapter);

        ArrayAdapter<CharSequence> to_adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.temperature, android.R.layout.simple_spinner_item);
        to_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        to_spinner.setAdapter(to_adapter);

        from_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                from_view.setText(adapterView.getItemAtPosition(i) + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        to_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                to_view.setText(adapterView.getItemAtPosition(i) + "");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        unitDBHelper = new UnitDBHelper(v.getContext());

        convert = v.findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!from_edit.getText().toString().isEmpty() || !from_edit.getText().toString().equals("")) {
                    try {
                        String unit_to = to_view.getText().toString();
                        String unit_from = from_view.getText().toString();

                        multiplier = Double.parseDouble(from_edit.getText().toString());


                        if (unit_from.equals(unit_to)) {
                            to_edit.setText(multiplier.toString(), null);
                        } else {
                            Cursor cr = unitDBHelper.getdatabase(unitDBHelper);
                            if (cr.moveToFirst()) {
                                do {
                                    if (unit_from.equals(cr.getString(0)) && unit_to.equals(cr.getString(1))) {
                                        value = Double.parseDouble(cr.getString(2));
                                        value = value * multiplier;
                                        to_edit.setText(value.toString(), null);
                                    }
                                } while (cr.moveToNext());
                            }
                        }
                    } catch (NumberFormatException e) {

                    }
                } else {
                    Toast.makeText(v.getContext(), "Enter the value !", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;
    }
}
