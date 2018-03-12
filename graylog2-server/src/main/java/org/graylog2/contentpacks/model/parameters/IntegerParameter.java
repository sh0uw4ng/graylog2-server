/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog2.contentpacks.model.parameters;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonDeserialize(builder = AutoValue_IntegerParameter.Builder.class)
public abstract class IntegerParameter implements Parameter<Integer> {
    static final String TYPE_NAME = "integer";

    @Override
    public Class<? extends Integer> valueClass() {
        return Integer.class;
    }

    public static Builder builder() {
        return new AutoValue_IntegerParameter.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder implements ParameterBuilder<Builder> {
        abstract IntegerParameter autoBuild();

        public IntegerParameter build() {
            type(TYPE_NAME);
            return autoBuild();
        }
    }
}
