/*
 * Copyright (c) 2014 Hewlett-Packard Development Company, L.P.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.hpcloud.mon.domain.model.alarmstatehistory;

import com.hpcloud.mon.domain.exception.EntityNotFoundException;
import org.joda.time.DateTime;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Repository for alarm state history.
 */
public interface AlarmStateHistoryRepository {
  /**
   * @throws EntityNotFoundException if an alarm cannot be found for the {@code alarmId}
   */
  List<AlarmStateHistory> findById(String tenantId, String alarmId) throws Exception;

  /**
   * Finds AlarmStateHistory for the given criteria.
   */
  Collection<AlarmStateHistory> find(String tenantId, Map<String, String> dimensions,
      DateTime startTime, @Nullable DateTime endTime) throws Exception;
}
