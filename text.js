function processData(data) {
  let validCodes = [];
  let invalidCodes = [];

  for (let code of data) {
    if (isValidCode(code)) {
      validCodes.push(normalizeCode(code));
    } else {
      invalidCodes.push(code);
    }
  }

  validCodes.sort();

  return {
    totalCodes: data.length,
    validCodes: validCodes.length,
    invalidCodes: invalidCodes.length,
    normalizedValidCodes: validCodes,
  };
}

function isValidCode(code) {
  if (code.length !== 7) {
    return false;
  }

  for (let i = 0; i < 3; i++) {
    let charCode = code.charCodeAt(i);
    if (
      !(charCode >= 65 && charCode <= 90) &&
      !(charCode >= 97 && charCode <= 122)
    ) {
      return false;
    }
  }

  for (let i = 3; i < 7; i++) {
    let charCode = code.charCodeAt(i);
    if (!(charCode >= 48 && charCode <= 57)) {
      return false;
    }
  }

  return true;
}

function normalizeCode(code) {
  return code.substring(0, 3).toUpperCase() + code.substring(3);
}

module.exports = { processData };
