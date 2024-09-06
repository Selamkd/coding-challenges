import { createLogger, format, transports } from 'winston';
const logger = createLogger({
    level: 'info', // logging level
    format: format.combine(format.timestamp({ format: 'YYYY-MM-DD HH:mm:ss' }), format.errors({ stack: true }), format.splat(), format.json() // can also use format.simple() or format.prettyPrint() for different formats
    ),
    transports: [
        new transports.Console({
            format: format.combine(format.colorize(), // colorise output
            format.simple() // simple format for console logs
            )
        }),
        new transports.File({ filename: 'logs/error.log', level: 'error' }), // log errors to a file
        new transports.File({ filename: 'logs/combined.log' }) // log everything to a combined log file
    ]
});
export default logger;
