/*
 *  Copyright 2013 The WebRTC project authors. All Rights Reserved.
 *
 *  Use of this source code is governed by a BSD-style license
 *  that can be found in the LICENSE file in the root of the source
 *  tree. An additional intellectual property rights grant can be found
 *  in the file PATENTS.  All contributing project authors may
 *  be found in the AUTHORS file in the root of the source tree.
 */

package org.webrtc;

/**
 * Representation of a change in selected ICE candidate pair.
 * {@code CandidatePairChangeEvent} in the C++ API.
 */
public final class CandidatePairChangeEvent {
  public final IceCandidate local;
  public final IceCandidate remote;
  public final int lastDataReceivedMs;
  public final String reason;

  @Override
  public String toString() {
    return "CandidatePairChangeEvent{" +
            "local=" + local +
            ", remote=" + remote +
            ", lastDataReceivedMs=" + lastDataReceivedMs +
            ", reason='" + reason + '\'' +
            '}';
  }

  @CalledByNative
  CandidatePairChangeEvent(
      IceCandidate local, IceCandidate remote, int lastDataReceivedMs, String reason) {
    this.local = local;
    this.remote = remote;
    this.lastDataReceivedMs = lastDataReceivedMs;
    this.reason = reason;
  }
}
