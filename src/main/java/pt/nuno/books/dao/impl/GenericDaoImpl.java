/*
 * Copyright 2015 Pivotal Software, Inc..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pt.nuno.books.dao.impl;

import java.util.List;
import java.util.Map;

/**
 *
 * @author nuno
 * @param <T>
 * @param <ID>
 */
public abstract class GenericDaoImpl<T, ID> implements GenericDao<T, ID> {

    @Override
    public T load(ID id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> filter(Map<String, Object> filter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // TODO: manage session factory
    // TODO: implement all abstract methods with Criteria API
}
