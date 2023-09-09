/*
 *
 *  * Copyright OpenSearch Contributors
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

package org.opensearch.sql.spark.transport.model;

import java.io.IOException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.opensearch.action.ActionRequest;
import org.opensearch.action.ActionRequestValidationException;
import org.opensearch.core.common.io.stream.StreamInput;

@AllArgsConstructor
public class GetJobQueryResultActionRequest extends ActionRequest {

  @Getter private String jobId;

  /** Constructor of GetJobQueryResultActionRequest from StreamInput. */
  public GetJobQueryResultActionRequest(StreamInput in) throws IOException {
    super(in);
  }

  @Override
  public ActionRequestValidationException validate() {
    return null;
  }
}
