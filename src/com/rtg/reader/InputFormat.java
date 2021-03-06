/*
 * Copyright (c) 2014. Real Time Genomics Limited.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the
 *    distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.rtg.reader;

/**
 * Sequence data input formats
 */
public enum InputFormat {
  /** SDF */
  SDF,
  /** FASTA */
  FASTA,
  /** FASTQ, Sanger quality encoding */
  FASTQ,
  /** FASTQ, Solexa earlier than version 1.3 quality encoding */
  SOLEXA,
  /** FASTQ, Solexa 1.3 quality encoding */
  SOLEXA1_3,
  /** CG TSV */
  TSV_CG,
  /** CG FASTQ */
  FASTQ_CG,
  /** SAM/BAM containing CG attributes */
  SAM_CG {
    @Override
    boolean isSam() {
      return true;
    }
    @Override
    public boolean isPairedSam() {
      return true;
    }
  },
  /** SAM/BAM single end */
  SAM_SE {
    @Override
    boolean isSam() {
      return true;
    }
  },
  /** SAM/BAM paired end */
  SAM_PE {
    @Override
    boolean isSam() {
      return true;
    }
    @Override
    public boolean isPairedSam() {
      return true;
    }
  };

  boolean isSam() {
    return false;
  }
  public boolean isPairedSam() {
    return false;
  }
}
