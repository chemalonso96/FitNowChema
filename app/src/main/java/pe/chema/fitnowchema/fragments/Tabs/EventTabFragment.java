package pe.chema.fitnowchema.fragments.Tabs;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.chema.fitnowchema.R;
import pe.chema.fitnowchema.adapters.WorkoutAdapter;
import pe.chema.fitnowchema.models.Workout;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventTabFragment extends Fragment {

    RecyclerView workoutRecyclerView;//los datos que no se vean sera eliminados para no ocupar espacio en el movil
    TextView titleTextView;
    Spinner spinnerSpinner;
    WorkoutAdapter workoutAdapter;//LIST
    RecyclerView.LayoutManager workoutLayoutManager;
    List<Workout> Listworkouts;

    String[] ejercicios_filtro = {"Cycling","Running","Walking","Swimming"};

    public EventTabFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_event_tab,container,false);

        Listworkouts = new ArrayList<>();
        Listworkouts.add(new Workout(1,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(2,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(3,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(4,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(5,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(6,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(7,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(8,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(9,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));
        Listworkouts.add(new Workout(10,"cycling", R.drawable.cycling, "Lima", "01 de enero", "8:00 am", "12:00 pm", 8 , 12));


        //como obtener el recycler?

        titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        spinnerSpinner = (Spinner) view.findViewById(R.id.spinner);
        workoutRecyclerView = (RecyclerView) view.findViewById(R.id.workoutFragmenLayout);
        workoutAdapter = new WorkoutAdapter(Listworkouts);
        workoutLayoutManager = new GridLayoutManager(view.getContext(),1);
        workoutRecyclerView.setAdapter(workoutAdapter);
        workoutRecyclerView.setLayoutManager(workoutLayoutManager);


        //crear adapter para el spinner
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_dropdown_item_1line,ejercicios_filtro);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSpinner.setAdapter(arrayAdapter);

        //flotting button

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}
