/*
 * Copyright 2015 Antonio López Marín <tonilopezmr.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.npatarino.android.gotchallenge.domain.interactor.common;

import rx.Observable;
import rx.Scheduler;


/**
 * @author Antonio López.
 */
public abstract class UseCase<T> {

    protected final Scheduler uiThread;
    protected final Scheduler executorThread;

    protected UseCase(Scheduler uiThread, Scheduler executorThread) {
        this.uiThread = uiThread;
        this.executorThread = executorThread;
    }

    public Observable<T> execute(){
        return buildUseCaseObservable();
    }

    protected abstract Observable<T> buildUseCaseObservable();
}
