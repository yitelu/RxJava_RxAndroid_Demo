package com.ytl.rxjava_rxandroid_demo.operators;

import android.util.Log;

import com.ytl.rxjava_rxandroid_demo.models.Task;
import com.ytl.rxjava_rxandroid_demo.util.DataSource;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Richard Yi-Te Lu on 29,September,2019
 */
public class FromIterable {

    private static final String TAG = "FromIterable";

    CompositeDisposable disposables = new CompositeDisposable();

    public FromIterable() {

//        Observable.fromIterable(DataSource.createTasksList())
//                .filter(new Predicate<Task>() {
//                    @Override
//                    public boolean test(Task task) throws Exception {
//                        return task.isComplete();
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
////                .distinct(new Function<Task, String>() {
////                    @Override
////                    public String apply(Task task) throws Exception {
////                        return task.getDescription();
////                    }
////                })
//                .subscribe(new Observer<Task>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "onSubscribe: called.");
//                        disposables.add(d);
//                    }
//
//                    @Override
//                    public void onNext(Task value) {
//                        Log.d(TAG, "onNext: COMPLETE: " + value.getDescription());
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e(TAG, "onError: ", e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "onComplete: found all the completed tasks...");
//                    }
//                });


        Observable<Task> taskObservable = Observable.fromIterable(DataSource.createTasksList())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        taskObservable.subscribe(new Observer<Task>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Task task) {
                Log.d(TAG, "onNext: : " + task.getDescription());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}

