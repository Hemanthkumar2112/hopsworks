/*
 * This file is part of Hopsworks
 * Copyright (C) 2019, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package io.hops.hopsworks.common.featurestore.featuregroup.cached;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.Nulls;
import io.hops.hopsworks.common.featurestore.featuregroup.FeaturegroupDTO;
import io.hops.hopsworks.persistence.entity.featurestore.featuregroup.Featuregroup;
import io.hops.hopsworks.persistence.entity.featurestore.featuregroup.cached.TimeTravelFormat;

/**
 * DTO containing the human-readable information of a cached feature group in the Hopsworks feature store,
 * can be converted to JSON or XML representation using jaxb.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("cachedFeaturegroupDTO")
public class CachedFeaturegroupDTO extends FeaturegroupDTO {

  @JsonSetter(nulls = Nulls.SKIP)
  private Boolean onlineEnabled = false;
  @JsonSetter(nulls = Nulls.SKIP)
  private TimeTravelFormat timeTravelFormat = TimeTravelFormat.NONE;

  public CachedFeaturegroupDTO() {
    super();
  }
  
  public CachedFeaturegroupDTO(Featuregroup featuregroup) {
    super(featuregroup);
  }

  public Boolean getOnlineEnabled() {
    return onlineEnabled;
  }
  
  public void setOnlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
  }

  public TimeTravelFormat getTimeTravelFormat () { return timeTravelFormat; }

  public void setTimeTravelFormat (TimeTravelFormat timeTravelFormat ) { this.timeTravelFormat = timeTravelFormat; }

  @Override
  public String toString() {
    return "CachedFeaturegroupDTO{" +
      ", onlineEnabled=" + onlineEnabled +
      ", timeTravelFormat =" + timeTravelFormat +
      '}';
  }
}
