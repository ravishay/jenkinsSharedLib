def call(def message, def severity) {
    echo "[${severity}]${message}"
}

def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}