/*
 * Copyright 2017 LinkedIn Corp. Licensed under the BSD 2-Clause License (the "License"). See License in the project root for license information.
 */

package com.linkedin.kafka.cruisecontrol.exception;

/**
 * An exception thrown when goal optimization failed.
 */
public class OptimizationFailureException extends KafkaCruiseControlException {

  private boolean tryAddBroker;

  public OptimizationFailureException(String message) {
    this(message, false);
  }

  public OptimizationFailureException(String message, boolean tryAddBroker) {
    super(message);
    this.tryAddBroker = tryAddBroker;
  }

  public boolean tryAddBroker() {
    return tryAddBroker;
  }
}
