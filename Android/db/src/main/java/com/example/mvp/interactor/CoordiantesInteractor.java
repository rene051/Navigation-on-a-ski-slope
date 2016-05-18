package com.example.mvp.interactor;

import com.example.mvp.listener.OnCoordinatesFetched;

/**
 * Intarface for interaction with web service coordinates.
 * Created by Rene on 6.12.2015..
 */
public interface CoordiantesInteractor {
    void fetchCoordinates(String sourcePoint, String destionationPoint, String routeType, String voiceInstructions, String language, OnCoordinatesFetched listener);
}