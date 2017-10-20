package pe.chema.fitnowchema.adapters;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import javax.xml.transform.Source;

import pe.chema.fitnowchema.R;
import pe.chema.fitnowchema.models.Workout;

/**
 * Created by mac on 10/17/17.
 */

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder>{
    private List<Workout> workouts;
    Context context;

    public Context getContext() {
        return context;
    }

    public WorkoutAdapter setContext(Context context) {
        this.context = context;
        return this;
    }

    public List<Workout> getWorkout() {
        return workouts;
    }

    public WorkoutAdapter setWorkout(List<Workout> workouts) {
        this.workouts = workouts;
        return this;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView type_eventTextView;
        public ImageView pictureImageView;
        public TextView placeTextView;
        public TextView dateTextView;
        public TextView hour_startTextView;
        public TextView hour_finishTextView;
        public TextView distanceTextView;
        public TextView membersTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            type_eventTextView = (TextView) itemView.findViewById(R.id.type_eventTextView);
            pictureImageView=(ImageView) itemView.findViewById(R.id.pictureImageView);
            placeTextView = (TextView) itemView.findViewById(R.id.placeTextView);
            dateTextView = (TextView) itemView.findViewById(R.id.dateTextView);
            hour_startTextView = (TextView) itemView.findViewById(R.id.hour_startTextView);
            hour_finishTextView = (TextView) itemView.findViewById(R.id.hour_finishTextView);
            distanceTextView = (TextView) itemView.findViewById(R.id.distanceTextView);
            membersTextView = (TextView) itemView.findViewById(R.id.membersTextview);
        }
    }

    public WorkoutAdapter(List<Workout> workout) {
        this.setWorkout(workout);
    }

    public WorkoutAdapter() {

    }

    public WorkoutAdapter(List<Workout> workouts, Context context) {
        this.workouts = workouts;
        this.context = context;
    }

    @Override
    public WorkoutAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.cardview_event,parent,false));
    }


    //va permitir que los datos aparescan en la pantalla solo mostrarlos
    @Override
    public void onBindViewHolder(WorkoutAdapter.ViewHolder holder, final int position) {
        final Workout workout = workouts.get(position);
        holder.type_eventTextView.setText(workout.getType());
        holder.placeTextView.setText(workout.getPlace());
        holder.dateTextView.setText(workout.getDate());
        holder.hour_startTextView.setText(workout.getHour_start());
        holder.hour_finishTextView.setText(workout.getHour_finish());
        holder.distanceTextView.setText(Integer.toString(workout.getDistance()));
        holder.membersTextView.setText(Integer.toString(workout.getMembers()));
    }

    @Override
    public int getItemCount() {
        return workouts.size();
    }


}
